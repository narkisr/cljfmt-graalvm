# Intro

This is a fork of [cljfmt-graalvm](https://gitlab.com/konrad.mrozek/cljfmt-graalvm) native binary version of cljfmt.

## Usage

Indenting code from stdin:

```bash
$ cat src/foo.clj | cljfmt
```

## Build

```bash
$ lein uberjar

$ native-image -jar target/cljfmt-graalvm-0.1.0-SNAPSHOT-standalone.jar -H:Name="cljfmt"
```

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
