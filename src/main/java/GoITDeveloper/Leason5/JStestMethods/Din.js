function fibonacciDynamic(n) {
    let fibo = new Array(n + 1);
    fibo[1] = 1;

    for (let i = 2; i <= n; i++) {
        fibo[i] = fibo[i - 1] + fibo[i - 2];
    }

    return fibo[n];
}