// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AcceptReservedInstancesExchangeQuoteRequestBuilderOps(
    val self: AcceptReservedInstancesExchangeQuoteRequest.Builder
) extends AnyVal {

  final def reservedInstanceIdsAsScala(
      value: Option[Seq[String]]
  ): AcceptReservedInstancesExchangeQuoteRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedInstanceIds(v.asJava)
    }
  }

  final def targetConfigurationsAsScala(
      value: Option[Seq[TargetConfigurationRequest]]
  ): AcceptReservedInstancesExchangeQuoteRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.targetConfigurations(v.asJava)
    }
  }

}

final class AcceptReservedInstancesExchangeQuoteRequestOps(val self: AcceptReservedInstancesExchangeQuoteRequest)
    extends AnyVal {

  final def reservedInstanceIdsAsScala: Option[Seq[String]] = Option(self.reservedInstanceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def targetConfigurationsAsScala: Option[Seq[TargetConfigurationRequest]] =
    Option(self.targetConfigurations).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptReservedInstancesExchangeQuoteRequestOps {

  implicit def toAcceptReservedInstancesExchangeQuoteRequestBuilderOps(
      v: AcceptReservedInstancesExchangeQuoteRequest.Builder
  ): AcceptReservedInstancesExchangeQuoteRequestBuilderOps =
    new AcceptReservedInstancesExchangeQuoteRequestBuilderOps(v)

  implicit def toAcceptReservedInstancesExchangeQuoteRequestOps(
      v: AcceptReservedInstancesExchangeQuoteRequest
  ): AcceptReservedInstancesExchangeQuoteRequestOps = new AcceptReservedInstancesExchangeQuoteRequestOps(v)

}
