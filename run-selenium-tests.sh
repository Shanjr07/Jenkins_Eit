SELELIUM=true
REMOTE=true
SAUCE_CONNECT_LOC="/home/jenkins/sc-4.3.16-linux/bin/sc"

cat - <<END > .rspec
--color
--format html
--out rspec_results.html
END