void main() {
    int a;
    int b;
    int res;
    int c;
    a = input(int);
    b = input(int);
    res = max(a,b,c);
    print(';');
    print(res);
}

int max(int a, int b, int c){
    int res;
    if (a > b) {
        res = a;
    }
    else {
        res = b;
    }
    return res; 
}
