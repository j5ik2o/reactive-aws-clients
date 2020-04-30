// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class SourceTableDetailsBuilderOps(val self: SourceTableDetails.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala(value: Option[String]): SourceTableDetails.Builder = {
            value.fold(self){ v => self.tableName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableIdAsScala(value: Option[String]): SourceTableDetails.Builder = {
            value.fold(self){ v => self.tableId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableArnAsScala(value: Option[String]): SourceTableDetails.Builder = {
            value.fold(self){ v => self.tableArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableSizeBytesAsScala(value: Option[Long]): SourceTableDetails.Builder = {
            value.fold(self){ v => self.tableSizeBytes(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keySchemaAsScala(value: Option[Seq[KeySchemaElement]]): SourceTableDetails.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keySchema(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableCreationDateTimeAsScala(value: Option[java.time.Instant]): SourceTableDetails.Builder = {
            value.fold(self){ v => self.tableCreationDateTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedThroughputAsScala(value: Option[ProvisionedThroughput]): SourceTableDetails.Builder = {
            value.fold(self){ v => self.provisionedThroughput(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def itemCountAsScala(value: Option[Long]): SourceTableDetails.Builder = {
            value.fold(self){ v => self.itemCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def billingModeAsScala(value: Option[BillingMode]): SourceTableDetails.Builder = {
            value.fold(self){ v => self.billingMode(v) }
            } 


}

final class SourceTableDetailsOps(val self: SourceTableDetails) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala: Option[String] = Option(self.tableName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableIdAsScala: Option[String] = Option(self.tableId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableArnAsScala: Option[String] = Option(self.tableArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableSizeBytesAsScala: Option[Long] = Option(self.tableSizeBytes) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def keySchemaAsScala: Option[Seq[KeySchemaElement]] = Option(self.keySchema).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableCreationDateTimeAsScala: Option[java.time.Instant] = Option(self.tableCreationDateTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedThroughputAsScala: Option[ProvisionedThroughput] = Option(self.provisionedThroughput) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def itemCountAsScala: Option[Long] = Option(self.itemCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def billingModeAsScala: Option[BillingMode] = Option(self.billingMode) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSourceTableDetailsOps {

implicit def toSourceTableDetailsBuilderOps(v: SourceTableDetails.Builder): SourceTableDetailsBuilderOps = new SourceTableDetailsBuilderOps(v)

implicit def toSourceTableDetailsOps(v: SourceTableDetails): SourceTableDetailsOps = new SourceTableDetailsOps(v)

}

