function fibonacciIterative(n) {
    if (n <= 1) {
        return n;
    }
    let fibPrev = 0, fibCurr = 1;
    for (let i = 2; i <= n; i++) {
        let temp = fibCurr;
        fibCurr = fibPrev + fibCurr;
        fibPrev = temp;
    }
    return fibCurr;
}