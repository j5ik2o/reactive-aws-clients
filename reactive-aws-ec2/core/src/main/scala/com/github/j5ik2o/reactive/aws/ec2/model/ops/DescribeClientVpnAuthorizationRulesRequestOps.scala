// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeClientVpnAuthorizationRulesRequestBuilderOps(
    val self: DescribeClientVpnAuthorizationRulesRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): DescribeClientVpnAuthorizationRulesRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeClientVpnAuthorizationRulesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeClientVpnAuthorizationRulesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeClientVpnAuthorizationRulesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeClientVpnAuthorizationRulesRequestOps(val self: DescribeClientVpnAuthorizationRulesRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClientVpnAuthorizationRulesRequestOps {

  implicit def toDescribeClientVpnAuthorizationRulesRequestBuilderOps(
      v: DescribeClientVpnAuthorizationRulesRequest.Builder
  ): DescribeClientVpnAuthorizationRulesRequestBuilderOps = new DescribeClientVpnAuthorizationRulesRequestBuilderOps(v)

  implicit def toDescribeClientVpnAuthorizationRulesRequestOps(
      v: DescribeClientVpnAuthorizationRulesRequest
  ): DescribeClientVpnAuthorizationRulesRequestOps = new DescribeClientVpnAuthorizationRulesRequestOps(v)

}
