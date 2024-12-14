process.stdin.resume();
process.stdin.setEncoding("utf-8");
let stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
    main(stdin_input);
});
 
function preprocess(S) {
    const charAppearances = Array.from({ length: 26 }, () => new Array(26).fill(0));
    const numberOfChars = Array(26).fill(0);
 
    for (let i = 0; i < S.length; i++) {
        const charCode = S[i].toLowerCase().charCodeAt(0) - 'a'.charCodeAt(0);
        if (charCode >= 0 && charCode < 26) {
            numberOfChars[charCode]++;
 
            for (let j = 0; j < 26; j++) {
                charAppearances[j][charCode] += numberOfChars[j];
            }
        }
    }
 
    return charAppearances;
}
 
 
function solve(data) {
    const S = data[0];
    const Q = parseInt(data[1]);
 
    const charAppeareances = preprocess(S);
    for (let i = 0; i < Q; i++) {
        const [a, b] = data[i + 2].split(" ");
        const aIndex = a.charCodeAt(0) - 'a'.charCodeAt(0)
        const bIndex = b.charCodeAt(0) - 'a'.charCodeAt(0)
        console.log(charAppeareances[aIndex][bIndex])
    }
 
}
 
function main(input) {
    const data = input.trim().split("\n");
    solve(data);
}
