function setBtn(obj,state) {
	if(state==1) obj.setAttribute("stroke","red");
	else if(state==2) obj.setAttribute("stroke","green");
	else if(state==3) obj.setAttribute("stroke","blue");
	else if(state==4) obj.setAttribute("stroke","none");
}