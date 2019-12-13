// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListProvisionedConcurrencyConfigsResponseBuilderOps(
    val self: ListProvisionedConcurrencyConfigsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedConcurrencyConfigsAsScala(
      value: Option[Seq[ProvisionedConcurrencyConfigListItem]]
  ): ListProvisionedConcurrencyConfigsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.provisionedConcurrencyConfigs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): ListProvisionedConcurrencyConfigsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

}

final class ListProvisionedConcurrencyConfigsResponseOps(val self: ListProvisionedConcurrencyConfigsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedConcurrencyConfigsAsScala: Option[Seq[ProvisionedConcurrencyConfigListItem]] =
    Option(self.provisionedConcurrencyConfigs).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListProvisionedConcurrencyConfigsResponseOps {

  implicit def toListProvisionedConcurrencyConfigsResponseBuilderOps(
      v: ListProvisionedConcurrencyConfigsResponse.Builder
  ): ListProvisionedConcurrencyConfigsResponseBuilderOps = new ListProvisionedConcurrencyConfigsResponseBuilderOps(v)

  implicit def toListProvisionedConcurrencyConfigsResponseOps(
      v: ListProvisionedConcurrencyConfigsResponse
  ): ListProvisionedConcurrencyConfigsResponseOps = new ListProvisionedConcurrencyConfigsResponseOps(v)

}
