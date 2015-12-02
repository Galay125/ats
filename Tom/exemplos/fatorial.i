void main() {
	int num;
	num = input(int);
	int resI;
	int resR;
	resI = fatorialI(num);
	resR = fatorialR(num);
	print(resI);
        print(';');
	print(resR);
}
int fatorialI(int num){
	int fat;
	if (!a) {
        	if (!a) {
			a=x;
		}
	}
	for(fat = 1; num > 1; num--){
		fat = fat * num;
	}
	return fat;
}
int fatorialR(int num){
	if (num==1 || num==0){
		return 1;
	}
	else{
		return num*fatorialR(num-1);
	}
}
