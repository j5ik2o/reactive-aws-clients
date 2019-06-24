// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetReservedInstancesExchangeQuoteRequestBuilderOps(
    val self: GetReservedInstancesExchangeQuoteRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstanceIdsAsScala(value: Option[Seq[String]]): GetReservedInstancesExchangeQuoteRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedInstanceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetConfigurationsAsScala(
      value: Option[Seq[TargetConfigurationRequest]]
  ): GetReservedInstancesExchangeQuoteRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.targetConfigurations(v.asJava)
    }
  }

}

final class GetReservedInstancesExchangeQuoteRequestOps(val self: GetReservedInstancesExchangeQuoteRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstanceIdsAsScala: Option[Seq[String]] = Option(self.reservedInstanceIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetConfigurationsAsScala: Option[Seq[TargetConfigurationRequest]] =
    Option(self.targetConfigurations).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetReservedInstancesExchangeQuoteRequestOps {

  implicit def toGetReservedInstancesExchangeQuoteRequestBuilderOps(
      v: GetReservedInstancesExchangeQuoteRequest.Builder
  ): GetReservedInstancesExchangeQuoteRequestBuilderOps = new GetReservedInstancesExchangeQuoteRequestBuilderOps(v)

  implicit def toGetReservedInstancesExchangeQuoteRequestOps(
      v: GetReservedInstancesExchangeQuoteRequest
  ): GetReservedInstancesExchangeQuoteRequestOps = new GetReservedInstancesExchangeQuoteRequestOps(v)

}
