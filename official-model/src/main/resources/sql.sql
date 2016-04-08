
SET @@SESSION .max_sp_recursion_depth = 5;

DELIMITER $


DROP PROCEDURE
IF EXISTS CREATE_CATALOG_TREE_ALL$
-- 创建tree all存储
CREATE PROCEDURE CREATE_CATALOG_TREE_ALL (IN root_id INT, IN n_depth INT)
BEGIN
	DECLARE
		done INT DEFAULT 0 ; DECLARE
			b INT ; DECLARE
				child CURSOR FOR SELECT
					id
				FROM
					of_catalog
				WHERE
					upid = root_id
				GROUP BY
					upid,
					seq ; DECLARE
						CONTINUE HANDLER FOR NOT FOUND
					SET done = 1 ; INSERT INTO tmp_list
					VALUES
						(NULL, root_id, n_depth) ; OPEN child ; FETCH child INTO b ;
					WHILE done = 0 DO
						CALL CREATE_CATALOG_TREE_ALL (b, n_depth + 1) ; FETCH child INTO b ;
					END
					WHILE ; CLOSE child ; END$

DROP PROCEDURE
IF EXISTS CREATE_CATALOG_TREE_STATS$
-- 创建tree status条件存储
CREATE PROCEDURE CREATE_CATALOG_TREE_STATS (
	IN root_id INT,
	IN n_depth INT,
	IN stats INT
)
BEGIN
	DECLARE
		done INT DEFAULT 0 ; DECLARE
			b INT ; DECLARE
				child CURSOR FOR SELECT
					id
				FROM
					of_catalog
				WHERE
					upid = root_id
				AND STATUS = stats
				GROUP BY
					upid,
					seq ; DECLARE
						CONTINUE HANDLER FOR NOT FOUND
					SET done = 1 ; INSERT INTO tmp_list
					VALUES
						(NULL, root_id, n_depth) ; OPEN child ; FETCH child INTO b ;
					WHILE done = 0 DO
						CALL CREATE_CATALOG_TREE_STATS (b, n_depth + 1, stats) ; FETCH child INTO b ;
					END
					WHILE ; CLOSE child ; END$

DROP PROCEDURE
IF EXISTS SHOW_CATALOG_TREE$
-- 显示tree 存储过程
CREATE PROCEDURE SHOW_CATALOG_TREE (IN root_id INT, IN stats INT)
BEGIN
	CREATE TEMPORARY TABLE
IF NOT EXISTS tmp_list (
	sno INT AUTO_INCREMENT,
	id INT,
	depth INT,
	PRIMARY KEY (sno)
) ; DELETE
FROM
	tmp_list ;
IF stats IS NULL THEN
	CALL CREATE_CATALOG_TREE_ALL (root_id, 0) ;
ELSE
	CALL CREATE_CATALOG_TREE_STATS (root_id, 0, stats) ;
END
IF ; SELECT
	tmp_list.*, of_catalog.*
FROM
	tmp_list,
	of_catalog
WHERE
	tmp_list.id = of_catalog.id
ORDER BY
	tmp_list.sno ; END$

DELIMITER ;



SET @@SESSION .max_sp_recursion_depth = 5;

CALL show_catalog_tree (0, 1);
