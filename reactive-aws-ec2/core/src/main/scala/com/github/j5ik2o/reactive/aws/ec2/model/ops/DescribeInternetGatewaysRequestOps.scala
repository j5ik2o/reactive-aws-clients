// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInternetGatewaysRequestBuilderOps(val self: DescribeInternetGatewaysRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeInternetGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def internetGatewayIdsAsScala(value: Option[Seq[String]]): DescribeInternetGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.internetGatewayIds(v.asJava)
    }
  }

}

final class DescribeInternetGatewaysRequestOps(val self: DescribeInternetGatewaysRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def internetGatewayIdsAsScala: Option[Seq[String]] = Option(self.internetGatewayIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInternetGatewaysRequestOps {

  implicit def toDescribeInternetGatewaysRequestBuilderOps(
      v: DescribeInternetGatewaysRequest.Builder
  ): DescribeInternetGatewaysRequestBuilderOps = new DescribeInternetGatewaysRequestBuilderOps(v)

  implicit def toDescribeInternetGatewaysRequestOps(
      v: DescribeInternetGatewaysRequest
  ): DescribeInternetGatewaysRequestOps = new DescribeInternetGatewaysRequestOps(v)

}
