process.stdin.resume();
process.stdin.setEncoding('utf-8');
 
var input_ = "";
 
process.stdin.on('data', function (data) {
    input_ += data.toString().trim();
    input_ += '\n';
});
function solution(N, S, comments) {
    const commentsContainS = comments.filter((comment) => comment.toLowerCase().includes(S.toLowerCase()));
    
    return commentsContainS.length;
}
process.stdin.on('end', function () {
    input_ = input_.replace(/\n$/, "");
    input_ = input_.split("\n");
 
    var idx_ = 0;
    var N = parseInt(input_[idx_++].trim(), 10);
    var S = input_[idx_++].trim();
    var comments = input_[idx_++].trim().split(' ')
 
    var out_ = solution( N,  S,  comments);
    process.stdout.write(out_.toString());
 
    process.exit();
 
});
