// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListBucketInventoryConfigurationsResponseBuilderOps(
    val self: ListBucketInventoryConfigurationsResponse.Builder
) extends AnyVal {

  final def continuationTokenAsScala(value: Option[String]): ListBucketInventoryConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.continuationToken(v)
    }
  }

  final def inventoryConfigurationListAsScala(
      value: Option[Seq[InventoryConfiguration]]
  ): ListBucketInventoryConfigurationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.inventoryConfigurationList(v.asJava)
    }
  }

  final def isTruncatedAsScala(value: Option[Boolean]): ListBucketInventoryConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  }

  final def nextContinuationTokenAsScala(value: Option[String]): ListBucketInventoryConfigurationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextContinuationToken(v)
    }
  }

}

final class ListBucketInventoryConfigurationsResponseOps(val self: ListBucketInventoryConfigurationsResponse)
    extends AnyVal {

  final def continuationTokenAsScala: Option[String] = Option(self.continuationToken)

  final def inventoryConfigurationListAsScala: Option[Seq[InventoryConfiguration]] =
    Option(self.inventoryConfigurationList).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated)

  final def nextContinuationTokenAsScala: Option[String] = Option(self.nextContinuationToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBucketInventoryConfigurationsResponseOps {

  implicit def toListBucketInventoryConfigurationsResponseBuilderOps(
      v: ListBucketInventoryConfigurationsResponse.Builder
  ): ListBucketInventoryConfigurationsResponseBuilderOps = new ListBucketInventoryConfigurationsResponseBuilderOps(v)

  implicit def toListBucketInventoryConfigurationsResponseOps(
      v: ListBucketInventoryConfigurationsResponse
  ): ListBucketInventoryConfigurationsResponseOps = new ListBucketInventoryConfigurationsResponseOps(v)

}
