package ru.job4j.tracker;

public class StubOutput implements Output {

        private final StringBuilder buffer = new StringBuilder();

        @Override
        public void println(Object obj) {
            buffer.append((obj != null) ? obj.toString() : buffer.append("null"));
            buffer.append(System.lineSeparator());
        }

        @Override
        public String toString() {
            return buffer.toString();
        }

}
