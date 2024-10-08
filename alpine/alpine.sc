{
    "defaultAction": "SCMP_ACT_ERRNO",
    "defaultErrnoRet": 1,
    "archMap": [
        {
            "architecture": "SCMP_ARCH_X86_64",
            "subArchitectures": [
                "SCMP_ARCH_X86",
                "SCMP_ARCH_X32"
            ]
        }
    ],
    "syscalls": [
        {
            "names": [
                "futex",
                "rt_sigprocmask",
                "epoll_create1",
                "fchdir",
                "sched_getaffinity",
                "listen",
                "faccessat",
                "openat",
                "sethostname",
                "stat",
                "nanosleep",
                "fstatfs",
                "recvfrom",
                "write",
                "arch_prctl",
                "brk",
                "execve",
                "rseq",
                "umask",
                "newfstatat",
                "rt_sigaction",
                "mmap",
                "epoll_ctl",
                "tgkill",
                "recv",
                "mkdir",
                "setuid",
                "read",
                "mknodat",
                "unlinkat",
                "seccomp",
                "recvmsg",
                "setgid",
                "epoll_pwait",
                "getsockname",
                "fchownat",
                "setsid",
                "clone",
                "pread64",
                "faccessat2",
                "pipe2",
                "sigaltstack",
                "clone3",
                "getrlimit",
                "capget",
                "unshare",
                "pivot_root",
                "getdents64",
                "readlinkat",
                "exit_group",
                "fcntl",
                "munmap",
                "madvise",
                "mount",
                "chdir",
                "keyctl",
                "statfs",
                "mkdirat",
                "setgroups",
                "geteuid",
                "set_robust_list",
                "fstat",
                "getppid",
                "getpid",
                "symlinkat",
                "close",
                "prctl",
                "getcwd",
                "getuid",
                "pread",
                "accept",
                "dup3",
                "accept4",
                "gettid",
                "rt_sigreturn",
                "umount2",
                "set_tid_address",
                "mprotect",
                "sendto",
                "bind",
                "sched_yield",
                "capset",
                "socket"
            ],
            "action": "SCMP_ACT_ALLOW"
        }
    ]
}