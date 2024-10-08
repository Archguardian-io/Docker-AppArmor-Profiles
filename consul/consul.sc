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
                "bind",
                "dup2",
                "recvfrom",
                "fsync",
                "faccessat",
                "writev",
                "pipe",
                "rt_sigtimedwait",
                "rt_sigprocmask",
                "unshare",
                "umount2",
                "getpeername",
                "fchdir",
                "read",
                "unlinkat",
                "setuid",
                "accept",
                "seccomp",
                "brk",
                "renameat",
                "wait4",
                "fork",
                "stat",
                "exit_group",
                "sethostname",
                "faccessat2",
                "socket",
                "pivot_root",
                "openat",
                "getuid",
                "rt_sigaction",
                "pread64",
                "munmap",
                "getsockopt",
                "sched_yield",
                "madvise",
                "mount",
                "connect",
                "sendto",
                "mprotect",
                "open",
                "tgkill",
                "write",
                "set_tid_address",
                "getrlimit",
                "rt_sigreturn",
                "nanosleep",
                "recv",
                "mkdirat",
                "getpid",
                "pipe2",
                "fcntl",
                "fstatfs",
                "fchownat",
                "geteuid",
                "arch_prctl",
                "futex",
                "getsockname",
                "capget",
                "recvmsg",
                "listen",
                "execve",
                "setsid",
                "accept4",
                "keyctl",
                "dup3",
                "statfs",
                "mkdir",
                "rseq",
                "setsockopt",
                "gettid",
                "clone",
                "symlinkat",
                "close",
                "prctl",
                "shutdown",
                "capset",
                "ioctl",
                "setgroups",
                "epoll_pwait",
                "newfstatat",
                "lstat",
                "set_robust_list",
                "getdents64",
                "getcwd",
                "uname",
                "pread",
                "fstat",
                "epoll_ctl",
                "sched_getaffinity",
                "getrandom",
                "chdir",
                "mknodat",
                "epoll_create1",
                "umask",
                "mmap",
                "sigaltstack",
                "clone3",
                "getppid",
                "readlinkat",
                "setgid",
                "getgid"
            ],
            "action": "SCMP_ACT_ALLOW"
        }
    ]
}