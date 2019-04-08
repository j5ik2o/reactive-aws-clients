// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ListImagesFilterBuilderOps(val self: ListImagesFilter.Builder) extends AnyVal {

  final def tagStatusAsScala(value: Option[TagStatus]): ListImagesFilter.Builder = {
    value.fold(self) { v =>
      self.tagStatus(v)
    }
  }

}

final class ListImagesFilterOps(val self: ListImagesFilter) extends AnyVal {

  final def tagStatusAsScala: Option[TagStatus] = Option(self.tagStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListImagesFilterOps {

  implicit def toListImagesFilterBuilderOps(v: ListImagesFilter.Builder): ListImagesFilterBuilderOps =
    new ListImagesFilterBuilderOps(v)

  implicit def toListImagesFilterOps(v: ListImagesFilter): ListImagesFilterOps = new ListImagesFilterOps(v)

}
