public int closeTen(int a, int b) {
    int aDiff = Math.abs(a - 10);
    int bDiff = Math.abs(b - 10); 
    if (aDiff < bDiff) {
        return a;
    } else if (bDiff < aDiff) {
        return b; 
    } else {
        return 0; 
    }
}
