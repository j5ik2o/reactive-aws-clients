// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyReservedInstancesRequestBuilderOps(val self: ModifyReservedInstancesRequest.Builder) extends AnyVal {

  final def reservedInstancesIdsAsScala(value: Option[Seq[String]]): ModifyReservedInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.reservedInstancesIds(v.asJava)
    }
  }

  final def clientTokenAsScala(value: Option[String]): ModifyReservedInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def targetConfigurationsAsScala(
      value: Option[Seq[ReservedInstancesConfiguration]]
  ): ModifyReservedInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.targetConfigurations(v.asJava)
    }
  }

}

final class ModifyReservedInstancesRequestOps(val self: ModifyReservedInstancesRequest) extends AnyVal {

  final def reservedInstancesIdsAsScala: Option[Seq[String]] = Option(self.reservedInstancesIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def targetConfigurationsAsScala: Option[Seq[ReservedInstancesConfiguration]] =
    Option(self.targetConfigurations).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyReservedInstancesRequestOps {

  implicit def toModifyReservedInstancesRequestBuilderOps(
      v: ModifyReservedInstancesRequest.Builder
  ): ModifyReservedInstancesRequestBuilderOps = new ModifyReservedInstancesRequestBuilderOps(v)

  implicit def toModifyReservedInstancesRequestOps(
      v: ModifyReservedInstancesRequest
  ): ModifyReservedInstancesRequestOps = new ModifyReservedInstancesRequestOps(v)

}
