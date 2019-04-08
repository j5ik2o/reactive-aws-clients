// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFpgaImagesRequestBuilderOps(val self: DescribeFpgaImagesRequest.Builder) extends AnyVal {

  final def fpgaImageIdsAsScala(value: Option[Seq[String]]): DescribeFpgaImagesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.fpgaImageIds(v.asJava)
    }
  }

  final def ownersAsScala(value: Option[Seq[String]]): DescribeFpgaImagesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.owners(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeFpgaImagesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeFpgaImagesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeFpgaImagesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeFpgaImagesRequestOps(val self: DescribeFpgaImagesRequest) extends AnyVal {

  final def fpgaImageIdsAsScala: Option[Seq[String]] = Option(self.fpgaImageIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ownersAsScala: Option[Seq[String]] = Option(self.owners).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFpgaImagesRequestOps {

  implicit def toDescribeFpgaImagesRequestBuilderOps(
      v: DescribeFpgaImagesRequest.Builder
  ): DescribeFpgaImagesRequestBuilderOps = new DescribeFpgaImagesRequestBuilderOps(v)

  implicit def toDescribeFpgaImagesRequestOps(v: DescribeFpgaImagesRequest): DescribeFpgaImagesRequestOps =
    new DescribeFpgaImagesRequestOps(v)

}
