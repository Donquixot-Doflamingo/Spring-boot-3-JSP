<%@ include file = "common/header.jspf"%>
<%@ include file = "common/nav.jspf"%>
<div class = "container">
	<H1>WELCOME ${name }</H1>
	<hr>	
	<H3>Your List of Todos</H3>
	<table class = "table">
		<thead>
			<tr>
				<th>Title</th>
				<th>Description</th>
				<th>User Name</th>
				<th>Date</th>
				<th>is Done?</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items = "${todos}" var = "todo">
				<tr>
					<td>${todo.title }</td>
					<td>${todo.description }</td>
					<td>${todo.username }</td>
					<td>${todo.targetDate }</td>
					<td>${todo.done }</td>
					<td>
						<a href = "delete-todo?id= ${ todo.id }" class = "btn btn-warning"> Delete</a>
						<a href = "update-todo?id= ${ todo.id }" class = "btn btn-success"> Update</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
</table>
<a href = "add-todo" class = "btn btn-success">Add Todo </a>
</div>
<%@ include file = "common/footer.jspf"%>
