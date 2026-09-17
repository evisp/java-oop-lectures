for W in week-01-why-objects week-02-classes-and-references \
         week-03-rules-and-ownership week-04-collections; do
  mkdir -p "$W/src"
  touch "$W/README.md"
done

touch week-01-why-objects/src/{Account,BankApp}.java
touch week-02-classes-and-references/src/{Account,BankApp,ReferenceDemo}.java
touch week-03-rules-and-ownership/src/{Account,BankApp}.java
touch week-04-collections/src/{Account,Customer,ManyAccountsApp,BankApp}.java

mkdir -p .github/workflows
touch .gitignore README.md .github/workflows/compile.yml

find . -path ./.git -prune -o -type f -print | sort