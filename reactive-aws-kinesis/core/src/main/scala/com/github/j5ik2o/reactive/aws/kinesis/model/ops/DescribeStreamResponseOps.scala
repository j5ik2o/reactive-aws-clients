// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DescribeStreamResponseBuilderOps(val self: DescribeStreamResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamDescriptionAsScala(value: Option[StreamDescription]): DescribeStreamResponse.Builder = {
            value.fold(self){ v => self.streamDescription(v) }
            } 


}

final class DescribeStreamResponseOps(val self: DescribeStreamResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamDescriptionAsScala: Option[StreamDescription] = Option(self.streamDescription) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStreamResponseOps {

implicit def toDescribeStreamResponseBuilderOps(v: DescribeStreamResponse.Builder): DescribeStreamResponseBuilderOps = new DescribeStreamResponseBuilderOps(v)

implicit def toDescribeStreamResponseOps(v: DescribeStreamResponse): DescribeStreamResponseOps = new DescribeStreamResponseOps(v)

}

