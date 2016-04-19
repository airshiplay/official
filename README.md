# official




#github使用
git status
git add .
git commit -m "log"
git push origin master

#maven使用
##jar包安装
mvn install:install-file -Dfile=[your file] -DgroupId=[xxxx] -DartifactId=[xxxx] -Dversion=[xxxx] -Dpackaging=[pom|jar|other]

mvn deploy:deploy-file -Dfile=[your file] -DgroupId=[xxxx] -DartifactId=[xxxx] -Dversion=[xxxx] -Dpackaging=[pom|jar|other] -DrepositoryId=[id] -Durl=[repo url]


##依赖关系
mvn dependency:tree
mvn project-info-reports:dependencies -X