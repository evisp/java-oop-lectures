for dir in week-*/ ; do
  echo "--- $dir"
  javac -d "$(mktemp -d)" "$dir"src/*.java || echo "FAILED: $dir"
done

git init -b main          # skip if already a repo
git add -A
git status                # no bin/, no .settings/
git commit -m "Scaffold: Module 1 lecture code, one folder per week"
git remote add origin git@github.com:evisp/java-oop-lectures.git
git push -u origin main