// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeCapacityProvidersResponseBuilderOps(val self: DescribeCapacityProvidersResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProvidersAsScala(
      value: Option[Seq[CapacityProvider]]
  ): DescribeCapacityProvidersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capacityProviders(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[Failure]]): DescribeCapacityProvidersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeCapacityProvidersResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeCapacityProvidersResponseOps(val self: DescribeCapacityProvidersResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProvidersAsScala: Option[Seq[CapacityProvider]] = Option(self.capacityProviders).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[Failure]] = Option(self.failures).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCapacityProvidersResponseOps {

  implicit def toDescribeCapacityProvidersResponseBuilderOps(
      v: DescribeCapacityProvidersResponse.Builder
  ): DescribeCapacityProvidersResponseBuilderOps = new DescribeCapacityProvidersResponseBuilderOps(v)

  implicit def toDescribeCapacityProvidersResponseOps(
      v: DescribeCapacityProvidersResponse
  ): DescribeCapacityProvidersResponseOps = new DescribeCapacityProvidersResponseOps(v)

}
