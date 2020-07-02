// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PutClusterCapacityProvidersRequestBuilderOps(val self: PutClusterCapacityProvidersRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): PutClusterCapacityProvidersRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProvidersAsScala(value: Option[Seq[String]]): PutClusterCapacityProvidersRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capacityProviders(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultCapacityProviderStrategyAsScala(
      value: Option[Seq[CapacityProviderStrategyItem]]
  ): PutClusterCapacityProvidersRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.defaultCapacityProviderStrategy(v.asJava)
    }
  }

}

final class PutClusterCapacityProvidersRequestOps(val self: PutClusterCapacityProvidersRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProvidersAsScala: Option[Seq[String]] =
    Option(self.capacityProviders).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultCapacityProviderStrategyAsScala: Option[Seq[CapacityProviderStrategyItem]] =
    Option(self.defaultCapacityProviderStrategy).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutClusterCapacityProvidersRequestOps {

  implicit def toPutClusterCapacityProvidersRequestBuilderOps(
      v: PutClusterCapacityProvidersRequest.Builder
  ): PutClusterCapacityProvidersRequestBuilderOps = new PutClusterCapacityProvidersRequestBuilderOps(v)

  implicit def toPutClusterCapacityProvidersRequestOps(
      v: PutClusterCapacityProvidersRequest
  ): PutClusterCapacityProvidersRequestOps = new PutClusterCapacityProvidersRequestOps(v)

}
