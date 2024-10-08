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
                "accept4",
                "fcntl",
                "socketpair",
                "socket",
                "fchdir",
                "poll",
                "recv",
                "exit_group",
                "getsockopt",
                "newfstatat",
                "epoll_ctl",
                "mknodat",
                "chdir",
                "pivot_root",
                "fchmod",
                "gettid",
                "writev",
                "getppid",
                "getpid",
                "mount",
                "brk",
                "getpeername",
                "shutdown",
                "getegid",
                "epoll_create1",
                "close",
                "set_tid_address",
                "chmod",
                "statfs",
                "nanosleep",
                "utimensat",
                "rt_sigreturn",
                "ioctl",
                "setgid",
                "set_robust_list",
                "setitimer",
                "umask",
                "clone3",
                "getpgrp",
                "getsockname",
                "sched_getaffinity",
                "bind",
                "getuid",
                "munmap",
                "setsockopt",
                "capget",
                "prlimit",
                "getcwd",
                "fstatfs",
                "getgid",
                "symlinkat",
                "tgkill",
                "readlink",
                "mmap",
                "getrandom",
                "uname",
                "geteuid",
                "rt_sigprocmask",
                "sethostname",
                "prlimit64",
                "dup3",
                "clone",
                "wait4",
                "sendto",
                "sendmmsg",
                "unlinkat",
                "fchown",
                "mprotect",
                "sigaltstack",
                "sched_yield",
                "openat",
                "pread",
                "recvmsg",
                "futex",
                "madvise",
                "fchmodat",
                "pipe2",
                "write",
                "sysinfo",
                "read",
                "unlink",
                "dup2",
                "rt_sigaction",
                "mkdir",
                "accept",
                "pselect6",
                "fchownat",
                "statx",
                "getdents64",
                "setgroups",
                "lseek",
                "epoll_pwait",
                "getrlimit",
                "recvfrom",
                "times",
                "setsid",
                "prctl",
                "rename",
                "listen",
                "rseq",
                "faccessat",
                "readlinkat",
                "unshare",
                "capset",
                "keyctl",
                "seccomp",
                "connect",
                "faccessat2",
                "access",
                "umount2",
                "setuid",
                "pread64",
                "mkdirat",
                "arch_prctl",
                "exit",
                "execve",
                "fstat"
            ],
            "action": "SCMP_ACT_ALLOW"
        }
    ]
}