# Intro

This is a fork of [cljfmt-graalvm](https://gitlab.com/konrad.mrozek/cljfmt-graalvm) native binary version of cljfmt that uses stdin as input.

## Usage

Indenting code from stdin:

```bash
$ cat src/foo.clj | cljfmt
```

## Build

```bash
$ lein uberjar

$ lein native-image
```

## License

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
