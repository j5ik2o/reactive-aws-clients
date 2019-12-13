// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeCapacityProvidersRequestBuilderOps(val self: DescribeCapacityProvidersRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProvidersAsScala(value: Option[Seq[String]]): DescribeCapacityProvidersRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capacityProviders(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAsScala(value: Option[Seq[CapacityProviderField]]): DescribeCapacityProvidersRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.include(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeCapacityProvidersRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeCapacityProvidersRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeCapacityProvidersRequestOps(val self: DescribeCapacityProvidersRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProvidersAsScala: Option[Seq[String]] = Option(self.capacityProviders).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAsScala: Option[Seq[CapacityProviderField]] = Option(self.include).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCapacityProvidersRequestOps {

  implicit def toDescribeCapacityProvidersRequestBuilderOps(
      v: DescribeCapacityProvidersRequest.Builder
  ): DescribeCapacityProvidersRequestBuilderOps = new DescribeCapacityProvidersRequestBuilderOps(v)

  implicit def toDescribeCapacityProvidersRequestOps(
      v: DescribeCapacityProvidersRequest
  ): DescribeCapacityProvidersRequestOps = new DescribeCapacityProvidersRequestOps(v)

}
