// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TableDescriptionBuilderOps(val self: TableDescription.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeDefinitionsAsScala(value: Option[Seq[AttributeDefinition]]): TableDescription.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributeDefinitions(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala(value: Option[String]): TableDescription.Builder = {
            value.fold(self){ v => self.tableName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): TableDescription.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keySchema(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableStatusAsScala(value: Option[TableStatus]): TableDescription.Builder = {
            value.fold(self){ v => self.tableStatus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def creationDateTimeAsScala(value: Option[java.time.Instant]): TableDescription.Builder = {
            value.fold(self){ v => self.creationDateTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedThroughputAsScala(value: Option[ProvisionedThroughputDescription]): TableDescription.Builder = {
            value.fold(self){ v => self.provisionedThroughput(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableSizeBytesAsScala(value: Option[Long]): TableDescription.Builder = {
            value.fold(self){ v => self.tableSizeBytes(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def itemCountAsScala(value: Option[Long]): TableDescription.Builder = {
            value.fold(self){ v => self.itemCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableArnAsScala(value: Option[String]): TableDescription.Builder = {
            value.fold(self){ v => self.tableArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableIdAsScala(value: Option[String]): TableDescription.Builder = {
            value.fold(self){ v => self.tableId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def billingModeSummaryAsScala(value: Option[BillingModeSummary]): TableDescription.Builder = {
            value.fold(self){ v => self.billingModeSummary(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localSecondaryIndexesAsScala(value: Option[Seq[LocalSecondaryIndexDescription]]): TableDescription.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localSecondaryIndexes(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def globalSecondaryIndexesAsScala(value: Option[Seq[GlobalSecondaryIndexDescription]]): TableDescription.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.globalSecondaryIndexes(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamSpecificationAsScala(value: Option[StreamSpecification]): TableDescription.Builder = {
            value.fold(self){ v => self.streamSpecification(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def latestStreamLabelAsScala(value: Option[String]): TableDescription.Builder = {
            value.fold(self){ v => self.latestStreamLabel(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def latestStreamArnAsScala(value: Option[String]): TableDescription.Builder = {
            value.fold(self){ v => self.latestStreamArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def globalTableVersionAsScala(value: Option[String]): TableDescription.Builder = {
            value.fold(self){ v => self.globalTableVersion(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicasAsScala(value: Option[Seq[ReplicaDescription]]): TableDescription.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.replicas(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def restoreSummaryAsScala(value: Option[RestoreSummary]): TableDescription.Builder = {
            value.fold(self){ v => self.restoreSummary(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseDescriptionAsScala(value: Option[SSEDescription]): TableDescription.Builder = {
            value.fold(self){ v => self.sseDescription(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def archivalSummaryAsScala(value: Option[ArchivalSummary]): TableDescription.Builder = {
            value.fold(self){ v => self.archivalSummary(v) }
            } 


}

final class TableDescriptionOps(val self: TableDescription) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def attributeDefinitionsAsScala: Option[Seq[AttributeDefinition]] = Option(self.attributeDefinitions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala: Option[String] = Option(self.tableName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableStatusAsScala: Option[TableStatus] = Option(self.tableStatus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def creationDateTimeAsScala: Option[java.time.Instant] = Option(self.creationDateTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedThroughputAsScala: Option[ProvisionedThroughputDescription] = Option(self.provisionedThroughput) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableSizeBytesAsScala: Option[Long] = Option(self.tableSizeBytes) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def itemCountAsScala: Option[Long] = Option(self.itemCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableArnAsScala: Option[String] = Option(self.tableArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableIdAsScala: Option[String] = Option(self.tableId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def billingModeSummaryAsScala: Option[BillingModeSummary] = Option(self.billingModeSummary) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def localSecondaryIndexesAsScala: Option[Seq[LocalSecondaryIndexDescription]] = Option(self.localSecondaryIndexes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def globalSecondaryIndexesAsScala: Option[Seq[GlobalSecondaryIndexDescription]] = Option(self.globalSecondaryIndexes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamSpecificationAsScala: Option[StreamSpecification] = Option(self.streamSpecification) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def latestStreamLabelAsScala: Option[String] = Option(self.latestStreamLabel) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def latestStreamArnAsScala: Option[String] = Option(self.latestStreamArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def globalTableVersionAsScala: Option[String] = Option(self.globalTableVersion) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def replicasAsScala: Option[Seq[ReplicaDescription]] = Option(self.replicas).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def restoreSummaryAsScala: Option[RestoreSummary] = Option(self.restoreSummary) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseDescriptionAsScala: Option[SSEDescription] = Option(self.sseDescription) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def archivalSummaryAsScala: Option[ArchivalSummary] = Option(self.archivalSummary) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTableDescriptionOps {

implicit def toTableDescriptionBuilderOps(v: TableDescription.Builder): TableDescriptionBuilderOps = new TableDescriptionBuilderOps(v)

implicit def toTableDescriptionOps(v: TableDescription): TableDescriptionOps = new TableDescriptionOps(v)

}

