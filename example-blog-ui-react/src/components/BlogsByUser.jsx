import React from 'react'

export default class BlogsByUser extends React.Component {
    render() {
        return (
            <div>
                <h1>Blogs by {this.props.match.params.user}</h1>
            </div>
        )
    }
}