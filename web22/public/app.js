function save(){
	const element = document.getElementById('age');
	console.log(element.value);
	
	const elements = document.getElementsByTagName('input');
	console.log(elements);
	
	n = elements.length;
	
	for(i=0;i<n;i++)
	{
		if(elements[i].type=="radio")
			console.log(elements[i].value);
	}
}