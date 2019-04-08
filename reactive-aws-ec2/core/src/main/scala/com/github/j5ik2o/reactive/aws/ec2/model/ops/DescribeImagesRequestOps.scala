// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeImagesRequestBuilderOps(val self: DescribeImagesRequest.Builder) extends AnyVal {

  final def executableUsersAsScala(value: Option[Seq[String]]): DescribeImagesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.executableUsers(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeImagesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def imageIdsAsScala(value: Option[Seq[String]]): DescribeImagesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.imageIds(v.asJava)
    }
  }

  final def ownersAsScala(value: Option[Seq[String]]): DescribeImagesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.owners(v.asJava)
    }
  }

}

final class DescribeImagesRequestOps(val self: DescribeImagesRequest) extends AnyVal {

  final def executableUsersAsScala: Option[Seq[String]] = Option(self.executableUsers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def imageIdsAsScala: Option[Seq[String]] = Option(self.imageIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ownersAsScala: Option[Seq[String]] = Option(self.owners).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImagesRequestOps {

  implicit def toDescribeImagesRequestBuilderOps(v: DescribeImagesRequest.Builder): DescribeImagesRequestBuilderOps =
    new DescribeImagesRequestBuilderOps(v)

  implicit def toDescribeImagesRequestOps(v: DescribeImagesRequest): DescribeImagesRequestOps =
    new DescribeImagesRequestOps(v)

}
