// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class IndexDocumentBuilderOps(val self: IndexDocument.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def suffixAsScala(value: Option[String]): IndexDocument.Builder = {
            value.fold(self){ v => self.suffix(v) }
            } 


}

final class IndexDocumentOps(val self: IndexDocument) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def suffixAsScala: Option[String] = Option(self.suffix) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIndexDocumentOps {

implicit def toIndexDocumentBuilderOps(v: IndexDocument.Builder): IndexDocumentBuilderOps = new IndexDocumentBuilderOps(v)

implicit def toIndexDocumentOps(v: IndexDocument): IndexDocumentOps = new IndexDocumentOps(v)

}

