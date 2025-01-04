process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";

process.stdin.on("data", function (input) {
    stdin_input += input;
});

process.stdin.on("end", function () {
   main(stdin_input);
});

function make_equal(T, S) {
    const N = T.length;
    for (let i=0;i<=parseInt(N/2);i++) {
        const ti = T[i];
        const si = S[i];
        const ti_corr = T[N-i-1];
        const si_corr = S[N-i-1];
        
        if (i==parseInt(N/2) && N%2==1) {
            return ti == si;
        }
        
        // equal
        if (ti == si && ti_corr == si_corr) continue;
        
        // swap ti with ti_corr
        if (ti == si_corr && si == ti_corr) continue;
        
        // swap si with ti and ti with ti_corr
        if (ti == ti_corr && si == si_corr) continue;
        
        // no option (swap) to make them equal
        return false;
    }
    
    return true;
}

function solve(data) {
    const T = data[0];
    const S = data[1];

    console.log(make_equal(T, S) ? "YES" : "NO")
}

function main(input) {
    const data = input.split("\n");
    solve(data)
}
