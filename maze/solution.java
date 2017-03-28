// how to find the entrance of a maze
void main() {

  while(! kornDa()) {
	if (linkeHandFrei()) {
		linksUm();
 		vor();
 		continue;
	}  
 	if (vornFrei()){
 		vor();
 		continue;
 	}
	if (rechteHandFrei()) {
 		rechtsUm();
 		vor();
 		continue;
 	} 
 	linksUm();
 	linksUm();
  }  
}


boolean linkeHandFrei() {
	linksUm();
	if (vornFrei()){
		rechtsUm();
		return true;
	}
	rechtsUm();
	return false;
}

boolean rechteHandFrei() {
	rechtsUm();
	if (vornFrei()){
		linksUm();
		return true;
	}
	linksUm();
	return false;
}

void rechtsUm() {
	linksUm(); 
	linksUm(); 
	linksUm();
}
