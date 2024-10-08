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
                "read",
                "listen",
                "getrlimit",
                "bind",
                "getegid",
                "symlinkat",
                "set_tid_address",
                "tgkill",
                "futex",
                "gettid",
                "fcntl",
                "fstat",
                "fstatfs",
                "uname",
                "getcwd",
                "eventfd2",
                "umount2",
                "umask",
                "socketpair",
                "socket",
                "exit",
                "sendto",
                "pwrite",
                "fdatasync",
                "rt_sigprocmask",
                "getrandom",
                "clock_getres",
                "setsockopt",
                "sched_yield",
                "newfstatat",
                "sched_getaffinity",
                "recvmsg",
                "faccessat",
                "pread",
                "unshare",
                "lseek",
                "dup2",
                "write",
                "getsockname",
                "dup3",
                "mknodat",
                "keyctl",
                "getpgrp",
                "connect",
                "sysinfo",
                "getsockopt",
                "mmap",
                "setgid",
                "readlinkat",
                "statx",
                "recvfrom",
                "shutdown",
                "pread64",
                "setuid",
                "unlinkat",
                "access",
                "epoll_pwait",
                "rt_sigaction",
                "chdir",
                "pivot_root",
                "accept4",
                "getrusage",
                "mkdir",
                "statfs",
                "epoll_ctl",
                "setgroups",
                "epoll_wait",
                "getuid",
                "exit_group",
                "setsid",
                "mount",
                "madvise",
                "clone3",
                "geteuid",
                "recv",
                "pwrite64",
                "fchdir",
                "pipe2",
                "capget",
                "accept",
                "rseq",
                "faccessat2",
                "getgid",
                "flock",
                "mprotect",
                "nanosleep",
                "seccomp",
                "clone",
                "mkdirat",
                "brk",
                "readlink",
                "sethostname",
                "ftruncate",
                "wait4",
                "munmap",
                "getdents64",
                "epoll_create1",
                "stat",
                "openat",
                "ioctl",
                "set_robust_list",
                "close",
                "arch_prctl",
                "sigaltstack",
                "execve",
                "getpid",
                "capset",
                "prlimit",
                "prlimit64",
                "getppid",
                "prctl",
                "rt_sigreturn",
                "fchownat"
            ],
            "action": "SCMP_ACT_ALLOW"
        }
    ]
}