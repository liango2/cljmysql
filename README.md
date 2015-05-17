# cljmysql

A Clojure library designed to ... well, that part is up to you.

## Usage

FIXME
C:\Users\liango\temp\cljmysql>lein deps
C:\Users\liango\temp\cljmysql>lein repl
nREPL server started on port 4173 on host 127.0.0.1 - nrepl://127.0.0.1:4173
REPL-y 0.3.1
Clojure 1.2.1
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)
 Results: Stored in vars *1, *2, *3, an exception in *e

user=> (load "/cljmysql/core")
nil
user=> (cljmysql.core/list-users)
({:t_name xiguazhu} {:t_name pingguozhu} {:t_name 可落叶儿} {:t_name 路人})
nil
user=>



## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
