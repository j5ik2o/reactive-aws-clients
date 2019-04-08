// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DescribeKeyRequestBuilderOps(val self: DescribeKeyRequest.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): DescribeKeyRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def grantTokensAsScala(value: Option[Seq[String]]): DescribeKeyRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.grantTokens(v.asJava)
    }
  }

}

final class DescribeKeyRequestOps(val self: DescribeKeyRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeKeyRequestOps {

  implicit def toDescribeKeyRequestBuilderOps(v: DescribeKeyRequest.Builder): DescribeKeyRequestBuilderOps =
    new DescribeKeyRequestBuilderOps(v)

  implicit def toDescribeKeyRequestOps(v: DescribeKeyRequest): DescribeKeyRequestOps = new DescribeKeyRequestOps(v)

}
