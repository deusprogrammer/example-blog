import React from 'react'

export default class Blog extends React.Component {
    render() {
        return (
            <div>
                <h1>Blog {this.props.match.params.blogId}</h1>
            </div>
        )
    }
}