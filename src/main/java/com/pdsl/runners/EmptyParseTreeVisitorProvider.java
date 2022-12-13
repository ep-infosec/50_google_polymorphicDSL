package com.pdsl.runners;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import javax.inject.Provider;

/**
 * A default provider used in the @PdslTest annotation.
 *
 * Either a listener or provider needs to be provided. In order to make the API usable this default, no-op class is
 * provided so that there will not be compilation errors when the user ignores it. This essentially allows the listener
 * field to be optional.
 */
class EmptyParseTreeVisitorProvider implements Provider<ParseTreeVisitor<Void>> {
    @Override
    public ParseTreeVisitor<Void> get() {
        return null;
    }
}
