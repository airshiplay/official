<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="modal-content">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<h4 class="modal-title" id="exampleModalLabel"> <c:if test="${cfgTag==null }">新增标签</c:if> <c:if test="${cfgTag!=null }">修改标签</c:if></h4>
	</div>
	<div class="modal-body">
		<form id="companyForm" data-parsley-validate
			class="form-horizontal form-label-left" method="post">
			
			<div class="form-group">
				<label class="control-label col-md-3 col-sm-3 col-xs-12"
					for="first-name">标签类型 </label>
				<div class="col-md-6 col-sm-6 col-xs-12">
					<select class="form-control col-md-7 col-xs-12" name="tagType">
					  <option value="1">用户标签</option>
					  <option value="2">文章标签</option>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-md-3 col-sm-3 col-xs-12"
					for="first-name">标签名称 </label>
				<div class="col-md-6 col-sm-6 col-xs-12">
					<input type="text" id="tagName" required="required" name="tagName"
						class="form-control col-md-7 col-xs-12" value="${cfgTag.tagName }">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3 col-sm-3 col-xs-12"
					for="last-name">标签名称 </label>
				<div class="col-md-6 col-sm-6 col-xs-12">
					<input type="text" id="tagDesc" name="tagDesc" required="true"
						class="form-control col-md-7 col-xs-12 disable"
						value="${cfgTag.tagDesc}">
				</div>
			</div>
			<div class="form-group">
				<label for="tel" class="control-label col-md-3 col-sm-3 col-xs-12">标签状态</label>
				<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="btn-group" data-toggle="buttons">
                      <label class="btn btn-default <c:if test="${cfgTag==null}"> active</c:if> <c:if test="${cfgTag.status==2}"> active</c:if> ">
                        <input type="radio" name="status" value="2" id="status"> 启用
                      </label>
                      <label class="btn btn-default <c:if test="${cfgTag.status==1}"> active</c:if> ">
                        <input type="radio" name="status" value="1" id="status"> 禁用
                      </label>
                 </div>
				</div>
			</div>
			<input type="hidden" name="id" value="${cfgTag.id}" />
			<input type="hidden" name="tagType" value="${cfgTag.tagType}" />
		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		<button type="button" class="btn btn-primary submit"
			onclick="companyForm.submit();">保存</button>
	</div>
</div>
<!-- /.modal-content -->
