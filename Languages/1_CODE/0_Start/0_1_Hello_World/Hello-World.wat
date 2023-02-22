(module
  (func $log (export "log")
    (param $ptr i32)
    (param $len i32)
    (call $js_log $ptr $len))
  
  (global $memory (export "memory") (mut 1) (memory 1))
  (global $message (export "message") (mut 1) (i32.const 0))

  (data (i32.const 0) "Hello, World!\n\00")

  (func $start
    (call $log
      (get_global $message)
      (i32.const 14)))

  (start $start))