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
                "openat",
                "getegid",
                "unlink",
                "stat",
                "mprotect",
                "access",
                "prlimit",
                "lseek",
                "setgroups",
                "getuid",
                "ftruncate",
                "read",
                "capset",
                "setsid",
                "dup3",
                "mlockall",
                "fstat",
                "get_mempolicy",
                "getpgrp",
                "unshare",
                "mmap",
                "sigaltstack",
                "bind",
                "umount2",
                "arch_prctl",
                "rt_sigreturn",
                "geteuid",
                "faccessat2",
                "socket",
                "statfs",
                "fadvise64",
                "accept4",
                "sethostname",
                "getdents64",
                "chmod",
                "munmap",
                "setgid",
                "epoll_create1",
                "umask",
                "readlinkat",
                "futex",
                "setuid",
                "close",
                "set_mempolicy",
                "writev",
                "getppid",
                "timerfd_create",
                "pipe2",
                "rmdir",
                "getpid",
                "fchdir",
                "clone",
                "getgid",
                "epoll_create",
                "ioctl",
                "recvmmsg",
                "brk",
                "rseq",
                "mkdirat",
                "clock_getres",
                "uname",
                "accept",
                "dup",
                "epoll_pwait2",
                "fsync",
                "recvfrom",
                "getsockopt",
                "getrusage",
                "recv",
                "gettid",
                "rt_sigaction",
                "mkdir",
                "prctl",
                "capget",
                "sendto",
                "set_tid_address",
                "sysinfo",
                "faccessat",
                "prlimit64",
                "sendmmsg",
                "epoll_wait",
                "epoll_pwait",
                "readlink",
                "write",
                "clock_nanosleep",
                "exit",
                "rename",
                "getrandom",
                "tgkill",
                "getsockname",
                "chdir",
                "sched_getaffinity",
                "flock",
                "rt_sigprocmask",
                "epoll_ctl",
                "msync",
                "set_robust_list",
                "statx",
                "exit_group",
                "keyctl",
                "madvise",
                "open",
                "vfork",
                "nanosleep",
                "listen",
                "recvmsg",
                "sched_yield",
                "dup2",
                "connect",
                "getrlimit",
                "wait4",
                "execve",
                "mount",
                "clone3",
                "getcwd",
                "newfstatat",
                "pivot_root",
                "seccomp",
                "fcntl",
                "symlinkat",
                "fstatfs",
                "setsockopt",
                "socketpair",
                "pread64",
                "unlinkat",
                "pread",
                "mknodat",
                "fdatasync",
                "eventfd2",
                "fchownat"
            ],
            "action": "SCMP_ACT_ALLOW"
        }
    ]
}