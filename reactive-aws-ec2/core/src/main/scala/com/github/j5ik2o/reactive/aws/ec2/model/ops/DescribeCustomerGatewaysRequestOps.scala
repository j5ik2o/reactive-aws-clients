// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeCustomerGatewaysRequestBuilderOps(val self: DescribeCustomerGatewaysRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customerGatewayIdsAsScala(value: Option[Seq[String]]): DescribeCustomerGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.customerGatewayIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeCustomerGatewaysRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

}

final class DescribeCustomerGatewaysRequestOps(val self: DescribeCustomerGatewaysRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customerGatewayIdsAsScala: Option[Seq[String]] =
    Option(self.customerGatewayIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] =
    Option(self.filters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCustomerGatewaysRequestOps {

  implicit def toDescribeCustomerGatewaysRequestBuilderOps(
      v: DescribeCustomerGatewaysRequest.Builder
  ): DescribeCustomerGatewaysRequestBuilderOps = new DescribeCustomerGatewaysRequestBuilderOps(v)

  implicit def toDescribeCustomerGatewaysRequestOps(
      v: DescribeCustomerGatewaysRequest
  ): DescribeCustomerGatewaysRequestOps = new DescribeCustomerGatewaysRequestOps(v)

}
