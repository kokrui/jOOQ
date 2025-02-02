/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.information_schema;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.meta.postgres.information_schema.tables.Attributes;
import org.jooq.meta.postgres.information_schema.tables.CheckConstraints;
import org.jooq.meta.postgres.information_schema.tables.Columns;
import org.jooq.meta.postgres.information_schema.tables.ConstraintColumnUsage;
import org.jooq.meta.postgres.information_schema.tables.Domains;
import org.jooq.meta.postgres.information_schema.tables.KeyColumnUsage;
import org.jooq.meta.postgres.information_schema.tables.Parameters;
import org.jooq.meta.postgres.information_schema.tables.ReferentialConstraints;
import org.jooq.meta.postgres.information_schema.tables.Routines;
import org.jooq.meta.postgres.information_schema.tables.Schemata;
import org.jooq.meta.postgres.information_schema.tables.Sequences;
import org.jooq.meta.postgres.information_schema.tables.Tables;
import org.jooq.meta.postgres.information_schema.tables.Views;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema</code>
     */
    public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

    /**
     * The table <code>information_schema.attributes</code>.
     */
    public final Attributes ATTRIBUTES = Attributes.ATTRIBUTES;

    /**
     * The table <code>information_schema.check_constraints</code>.
     */
    public final CheckConstraints CHECK_CONSTRAINTS = CheckConstraints.CHECK_CONSTRAINTS;

    /**
     * The table <code>information_schema.columns</code>.
     */
    public final Columns COLUMNS = Columns.COLUMNS;

    /**
     * The table <code>information_schema.constraint_column_usage</code>.
     */
    public final ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE;

    /**
     * The table <code>information_schema.domains</code>.
     */
    public final Domains DOMAINS = Domains.DOMAINS;

    /**
     * The table <code>information_schema.key_column_usage</code>.
     */
    public final KeyColumnUsage KEY_COLUMN_USAGE = KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.parameters</code>.
     */
    public final Parameters PARAMETERS = Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.referential_constraints</code>.
     */
    public final ReferentialConstraints REFERENTIAL_CONSTRAINTS = ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.routines</code>.
     */
    public final Routines ROUTINES = Routines.ROUTINES;

    /**
     * The table <code>information_schema.schemata</code>.
     */
    public final Schemata SCHEMATA = Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.sequences</code>.
     */
    public final Sequences SEQUENCES = Sequences.SEQUENCES;

    /**
     * The table <code>information_schema.tables</code>.
     */
    public final Tables TABLES = Tables.TABLES;

    /**
     * The table <code>information_schema.views</code>.
     */
    public final Views VIEWS = Views.VIEWS;

    /**
     * No further instances allowed
     */
    private InformationSchema() {
        super("information_schema", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Attributes.ATTRIBUTES,
            CheckConstraints.CHECK_CONSTRAINTS,
            Columns.COLUMNS,
            ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE,
            Domains.DOMAINS,
            KeyColumnUsage.KEY_COLUMN_USAGE,
            Parameters.PARAMETERS,
            ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
            Routines.ROUTINES,
            Schemata.SCHEMATA,
            Sequences.SEQUENCES,
            Tables.TABLES,
            Views.VIEWS
        );
    }
}
