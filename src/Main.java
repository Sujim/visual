public class Main {

    public static void main(String[] args) {
        git fetch              # update 'master' from remote
        git tag base master    # mark our base point
        git rebase -i master   # rewrite some commits
        git push --force-with-lease=master:base master:master
}
<head>
<title>Hello gt</title>
        + <script>console.log("hello git!")</script>
</head>
        git push [--all | --mirror | --tags] [--follow-tags] [--atomic] [-n | --dry-run] [--receive-pack=<git-receive-pack>]
        [--repo=<repository>] [-f | --force] [-d | --delete] [--prune] [-v | --verbose]
        [-u | --set-upstream] [--push-option=<string>]
        [--[no-]signed|--signed=(true|false|if-asked)]
        [--force-with-lease[=<refname>[:<expect>]]]
        [--no-verify] [<repository> [<refspec>…​]]