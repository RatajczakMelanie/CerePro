<%@ page import="com.cerepro.web.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style><%@include file="/css/calendar.css"%></style>
</head>
<body>
 
<!--  <span class="active"> markiert aktiven Tag-->
<%
	Employee a1 = (Employee) session.getAttribute("employee");
	//out.println(a1);
    String name = a1.getName();
	%>
<h2>Guten Morgen <%out.println(name); %></h2>
   <!-- <div class="month">
  <ul>
    <li class="prev">&#10094;</li>
    <li class="next">&#10095;</li>
    <li>Februar<br><span style="font-size:18px">2021</span></li>
  </ul>
</div>

<ul class="weekdays">
  <li>Mo</li>
  <li>Tu</li>
  <li>We</li>
  <li>Th</li>
  <li>Fr</li>
  <li>Sa</li>
  <li>Su</li>
</ul>

<ul class="days">
  <li>1</li>
  <li>2</li>
  <li>3</li>
  <li>4</li>
  <li>5</li>
  <li>6</li>
  <li>7</li>
  <li>8</li>
  <li>9</li>
  <li>10</li>
  <li>11</li>
  <li>12</li>
  <li>13</li>
  <li>14</li>
  <li>15</li>
  <li>16</li>
  <li>17</li>
  <li>18</li>
  <li>19</li>
  <li>20</li>
  <li>21</li>
  <li>22</li>
  <li>23</li>
  <li>24</li>
  <li>25</li>
  <li>26</li>
  <li>27</li>
  <li>28</li>
</ul>  -->

	
	 
	 <form action="getEmployees">
		<input type="date" name="vacationStart"> 
		<input type="date" name="VacationEnd">
		 <input type="submit">
	</form>
</body>
</html>