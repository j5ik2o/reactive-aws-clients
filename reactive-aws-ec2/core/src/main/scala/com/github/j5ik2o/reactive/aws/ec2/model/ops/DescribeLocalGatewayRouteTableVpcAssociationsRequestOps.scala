// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLocalGatewayRouteTableVpcAssociationsRequestBuilderOps(
    val self: DescribeLocalGatewayRouteTableVpcAssociationsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVpcAssociationIdsAsScala(
      value: Option[Seq[String]]
  ): DescribeLocalGatewayRouteTableVpcAssociationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      self.localGatewayRouteTableVpcAssociationIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeLocalGatewayRouteTableVpcAssociationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeLocalGatewayRouteTableVpcAssociationsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeLocalGatewayRouteTableVpcAssociationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeLocalGatewayRouteTableVpcAssociationsRequestOps(
    val self: DescribeLocalGatewayRouteTableVpcAssociationsRequest
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localGatewayRouteTableVpcAssociationIdsAsScala: Option[Seq[String]] =
    Option(self.localGatewayRouteTableVpcAssociationIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLocalGatewayRouteTableVpcAssociationsRequestOps {

  implicit def toDescribeLocalGatewayRouteTableVpcAssociationsRequestBuilderOps(
      v: DescribeLocalGatewayRouteTableVpcAssociationsRequest.Builder
  ): DescribeLocalGatewayRouteTableVpcAssociationsRequestBuilderOps =
    new DescribeLocalGatewayRouteTableVpcAssociationsRequestBuilderOps(v)

  implicit def toDescribeLocalGatewayRouteTableVpcAssociationsRequestOps(
      v: DescribeLocalGatewayRouteTableVpcAssociationsRequest
  ): DescribeLocalGatewayRouteTableVpcAssociationsRequestOps =
    new DescribeLocalGatewayRouteTableVpcAssociationsRequestOps(v)

}
